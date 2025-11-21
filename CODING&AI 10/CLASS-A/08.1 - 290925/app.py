from flask import Flask, request

app = Flask(__name__)

@app.route("/")
@app.route("/home")
def home():
    return f"HALLO NAMAKU = { request.args.get("name") } saya berusia { request.args.get("usia") }"
# http://127.0.0.1:5000/home?name=nana&usia=15

@app.route("/about/<name>")
def about(name):
    return f"About Page. = {name}"


@app.route("/contact/<name>/<int:age>")
def contact(name, age):
    if ( 0 >= age <= 6 ):
        status = "balita"
    elif ( 7 >= age <= 12 ):
        status = "anak-anak"
    else:
        status = "INVALID !"

    return f"nama adikku adalah {name} berusia {status}"

if __name__ == "__main__":
    app.run(debug=True, host="0.0.0.0", port=5000)
