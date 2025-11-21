from flask import Flask, render_template

app = Flask(__name__)

@app.route("/")
@app.route("/home")
def home():
    return render_template("home.html")

@app.route("/biodata")
def biodata():
    return render_template("biodata.html")

if __name__ == "__main__":
    app.run(debug=True, host="0.0.0.0", port= 8081 )