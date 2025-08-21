from flask import Flask, request

app = Flask(__name__)


@app.route("/")
@app.route("/home")
def home():
    return "Home Page"


@app.route("/about")
def about():
    return "about Page"


@app.route("/contact")
def contact():
    return "contact Page"


@app.route("/halo/<name>")
def halo(name):
    return f"Hallo {name}"


@app.route("/mybio/<name>/<int:age>")
def mybio(name, age):
    if 0 <= age <= 17:
        status = "anak anak"
    elif 18 <= age <= 40:
        status = "dewasa"
    else:
        status = "tua"
    return f"Hallo {name}, usia kamu {age}, kamu {status}"


@app.route("/cari")
def cari():
    keyword = request.args.get("keywords")
    return f"hasil = {keyword}"


@app.route("/bio")
def bio():
    return f"Heii nama saya  {request.args.get('name')} sekarang berusia {request.args.get('age')} sedang belajar {request.args.get('mapel')}"


if __name__ == "__main__":
    app.run(debug=True)
