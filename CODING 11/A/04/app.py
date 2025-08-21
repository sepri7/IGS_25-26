from flask import Flask, render_template, redirect, url_for, request

app = Flask(__name__)


@app.route("/")
@app.route("/home")
def home():
    return render_template("home.html")


@app.route("/inputdata")
def inputdata():
    return render_template("inputdata.html")


@app.route("/bio", methods=["POST", "GET"])
def bio():
    nama = request.form["nama"]
    kelas = request.form["kelas"]
    email = request.form["email"]
    tempat = request.form["tempat"]
    tgl = request.form["tgl"]
    cita = request.form["cita"]
    agama = request.form["agama"]
    tentang = request.form["tentang"]
    return render_template(
        "bio.html",
        nama=nama,
        kelas=kelas,
        email=email,
        tempat=tempat,
        tgl=tgl,
        cita=cita,
        agama=agama,
        tentang=tentang,
    )


if __name__ == "__main__":
    app.run(debug=True)
