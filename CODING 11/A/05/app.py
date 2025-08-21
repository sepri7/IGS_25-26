from flask import Flask, render_template, redirect, url_for, request, session
import secrets

app = Flask(__name__)
app.secret_key = secrets.token_hex(16)

user = [{"username": "admin", "password": "1234", "role": "admin"}]


def prosesLogin(username, password):
    for i in user:
        if i["username"] == username and i["password"] == password:
            return i["role"]
        return None


@app.route("/")
@app.route("/home")
def home():
    return render_template("home.html")


@app.route("/login", methods=["POST", "GET"])
def login():
    username = request.form["username"]
    password = request.form["password"]
    hasillogin = prosesLogin(username, password)
    if hasillogin == "admin":
        session["user"] = "admin"
        return redirect(url_for("admin"))
    return redirect(url_for("home"))


@app.route("/admin")
def admin():
    if session.get("user") == "admin":
        return render_template("admin.html")
    return redirect(url_for("home"))


@app.route("/logout")
def logout():
    session.clear()
    return redirect(url_for("home"))


if __name__ == "__main__":
    app.run(debug=True)
