from flask import Flask, render_template, redirect, url_for

app = Flask(__name__)
for i in range(4, 10):  # loop ini membuat : 0 1 2 3 4 5
    # for i in range(4, 10): # 4, 5, 6, 7, 8, 9
    # for i in range(4, 10, 2): # 4, 6, 8
    print(i)


@app.route("/")
@app.route("/home")
def home():
    return render_template("index.html")


@app.route("/tester_route")
def tester_func():
    return f"tester"


@app.route("/render_route")
def route_func():
    return redirect(url_for("home"))


if __name__ == "__main__":
    app.run(debug=True, host="0.0.0.0", port=8080)
