from flask import Flask, render_template

app = Flask(__name__)


@app.route("/")
@app.route("/home")
def home():
    return f"AKU BISA !"


@app.route("/profile/<name>/<kelas>")
def profile(name, kelas):
    return f"haii nama saya {name}, kelasku {kelas}"


@app.route("/hitung/<int:angka1>/<int:angka2>")
def hitung(angka1, angka2):
    result = angka1 + angka2
    return f"hasil dari {angka1} + {angka2} = {result}"


@app.route("/biodata")
def biodata():
    return render_template("biodata.html")


if __name__ == "__main__":
    app.run(debug=True, host="0.0.0.0", port=5000)
