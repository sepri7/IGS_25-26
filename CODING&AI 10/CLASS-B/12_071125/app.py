from flask import Flask, render_template

app = Flask(__name__)

nilai = 90
nilaiSiswa = [88, 70, 60, 50, 90, 60]
a = 11
b = 10


# buat if-Statement : Keadaan ( a + b ==  ganjil == tampil ganjil)
# Keadaan ( a + b ==  genap == tampil genap
@app.route("/")
@app.route("/beranda")
def beranda():
    return render_template("beranda.html", nilai=nilai, a=a, b=b)


@app.route("/nilai")
def nilai():
    return render_template("nilai.html", nilaiSiswa=nilaiSiswa)


if __name__ == "__main__":
    app.run(debug=True, host="0.0.0.0", port=8080)
