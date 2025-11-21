from flask import Flask, render_template
app = Flask(__name__)
nilai = 60
if nilai == 100:
    print("sempurna ....")
@app.route("/")
@app.route("/home")
def home():
    return render_template("home.html",nilais = nilai)

@app.route("/informasi")
def informasi(): 
    return render_template("informasi.html")

@app.route("/about")
def about():
    return render_template("about.html")

@app.route("/contact")
def contact():
    return render_template("contact.html")

if __name__ == "__main__":
    app.run(debug=True, host="0.0.0.0", port=8080)
