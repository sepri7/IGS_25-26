from flask import Flask, render_template
app = Flask(__name__)

hari = 1

@app.route("/")
@app.route("/beranda")
def beranda():
    return render_template("beranda.html", hari = hari)

if __name__ == "__main__":
    app.run(debug=True,host="0.0.0.0", port=5151)