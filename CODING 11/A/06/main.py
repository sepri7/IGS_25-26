from flask import Flask, render_template, redirect, request, url_for
from flask_sqlalchemy import SQLAlchemy

db = SQLAlchemy()


def init_db(app, url_db="sqlite:///siswa.db"):
    app.config["SQLALCHEMY_DATABASE_URI"] = url_db
    app.config["SQLALCHEMY_TRACT_MODIFICATION"] = False
    db.init_app(app)

    with app.app_context():
        db.create_all()


class Siswa(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    nama = db.Column(db.String(100))
    umur = db.Column(db.Integer)


app = Flask(__name__)
init_db(app)


@app.route("/")
def home():
    data_siswa = Siswa.query.all()
    return render_template("home.html", data_siswa=data_siswa)


@app.route("/simpan", methods=["GET", "POST"])
def simpan():
    if request.method == "POST":
        nama = request.form["nama"]
        umur = request.form["umur"]
        newData = Siswa(nama=nama, umur=umur)
        db.session.add(newData)
        db.session.commit()
        return redirect(url_for("home"))
    else:
        return render_template("simpan.html")


@app.route("/hapus/<int:id>")
def hapus(id):
    dataDelete = Siswa.query.get_or_404(id)
    db.session.delete(dataDelete)
    db.session.commit()
    return redirect(url_for("home"))


@app.route("/update/<int:id>", methods=["GET", "POST"])
def update(id):
    dataEdit = Siswa.query.get_or_404(id)
    if request.method == "POST":
        dataEdit.nama = request.form["nama"]
        dataEdit.umur = request.form["umur"]
        db.session.commit()
        return redirect(url_for("home"))
    else:
        return render_template("update.html", data=dataEdit)


if __name__ == "__main__":
    app.run(debug=True)
