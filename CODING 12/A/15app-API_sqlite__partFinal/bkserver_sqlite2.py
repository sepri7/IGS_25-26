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
    email = db.Column(db.String(120), nullable=True)
    tanggal = db.Column(
        db.String(20), nullable=True
    )  # simpan sebagai string (YYYY-MM-DD)
    mapel = db.Column(db.String(100), nullable=True)
    jenisKelamin = db.Column(db.String(10), nullable=True)  # "L" / "P"
    catatan = db.Column(db.Text, nullable=True)

    def to_dict(self):
        return {
            "id": self.id,
            "nama": self.nama,
            "guru": self.guru,
            "email": self.email,
            "tanggal": self.tanggal,
            "mapel": self.mapel,
            "jenisKelamin": self.jenisKelamin,
            "catatan": self.catatan,
        }


with app.app_context():
    db.create_all()


@app.route("/pelajaran", methods=["GET"])
def get_all():
    pelajaran = Pelajaran.query.all()
    return jsonify([p.to_dict() for p in pelajaran])


@app.route("/pelajaran", methods=["POST"])
def add_one():
    data = request.get_json()
    new_data = Pelajaran(
        nama=data.get("nama"),
        guru=data.get("guru"),
        email=data.get("email"),
        tanggal=data.get("tanggal"),
        mapel=data.get("mapel"),
        jenisKelamin=data.get("jenisKelamin"),
        catatan=data.get("catatan"),
    )
    db.session.add(new_data)
    db.session.commit()
    return jsonify(new_data.to_dict())


@app.route("/pelajaran/<int:id>", methods=["PUT"])
def update_one(id):
    data = request.get_json()
    a = Pelajaran.query.get_or_404(id)
    a.nama = data.get("nama", a.nama)
    a.guru = data.get("guru", a.guru)
    a.email = data.get("email", a.email)
    a.tanggal = data.get("tanggal", a.tanggal)
    a.mapel = data.get("mapel", a.mapel)
    a.jenisKelamin = data.get("jenisKelamin", a.jenisKelamin)
    a.catatan = data.get("catatan", a.catatan)
    db.session.commit()
    return jsonify(a.to_dict())


@app.route("/pelajaran/<int:id>", methods=["PATCH"])
def patch_one(id):
    data = request.get_json()
    a = Pelajaran.query.get_or_404(id)
    if "nama" in data:
        a.nama = data["nama"]
    if "guru" in data:
        a.guru = data["guru"]
    if "email" in data:
        a.email = data["email"]
    if "tanggal" in data:
        a.tanggal = data["tanggal"]
    if "mapel" in data:
        a.mapel = data["mapel"]
    if "jenisKelamin" in data:
        a.jenisKelamin = data["jenisKelamin"]
    if "catatan" in data:
        a.catatan = data["catatan"]
    db.session.commit()
    return jsonify(a.to_dict())


@app.route("/pelajaran/<int:id>", methods=["DELETE"])
def delete_one(id):
    a = Pelajaran.query.get_or_404(id)
    db.session.delete(a)
    db.session.commit()
    return jsonify({"message": "Data Pelajaran berhasil dihapus!"})


if __name__ == "__main__":
    app.run(debug=True, host="0.0.0.0", port=8080)
