from flask import Flask, request, jsonify
from flask_sqlalchemy import SQLAlchemy
from flask_cors import CORS

app = Flask(__name__)
CORS(app)

app.config["SQLALCHEMY_DATABASE_URI"] = "sqlite:///pelajaran.db"
app.config["SQLALCHEMY_TRACK_MODIFICATIONS"] = False

db = SQLAlchemy(app)


class Pelajaran(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    nama = db.Column(db.String(100), nullable=False)
    guru = db.Column(db.String(100), nullable=False)

    def to_dict(self):
        return {"id": self.id, "nama": self.nama, "guru": self.guru}


with app.app_context():
    db.create_all()


@app.route("/pelajaran", methods=["GET"])
def get_all():
    pelajaran = Pelajaran.query.all()
    return jsonify([p.to_dict() for p in pelajaran])


@app.route("/pelajaran", methods=["POST"])
def add_one():
    data = request.get_json()
    new_data = Pelajaran(nama=data["nama"], guru=data["guru"])
    db.session.add(new_data)
    db.session.commit()
    return jsonify(new_data.to_dict())


if __name__ == "__main__":
    app.run(debug=True, host="0.0.0.0", port=8080)
