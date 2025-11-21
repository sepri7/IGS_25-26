from flask import Flask, render_template, redirect, url_for

app = Flask(__name__)


@app.route("/")
@app.route("/home")
def home():
    return render_template("index.html")


@app.route("/informasi")
def informasi():
    return render_template("informasi.html")


if __name__ == "__main__":
    app.run(debug=True, host="0.0.0.0", port=8080)
