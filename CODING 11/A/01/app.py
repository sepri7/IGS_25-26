from flask import Flask, render_template, redirect, url_for

app = Flask(__name__)

data = [
    {"nama": "budi", "kelas": 10},
    {"nama": "nana", "kelas": 11},
    {"nama": "nini", "kelas": 12},
    {"nama": "nono", "kelas": 13},
]
name = "budi"


@app.route("/")
@app.route("/home")
def home():
    return render_template("home.html", datas=data, name=name)


@app.route("/newhome")
def newhomes():
    return redirect(url_for("home"))


@app.route("/about")
def about():
    return render_template("about.html")


@app.route("/contact")
def contact():
    return render_template("contact.html")


if __name__ == "__main__":
    app.run(debug=True)
