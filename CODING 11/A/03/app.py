from flask import Flask, render_template, redirect, url_for, request

app = Flask(__name__)


@app.route("/")
@app.route("/calculator")
def calculator():
    # localhost:5050/calculator?n1=3&n2=5&op=add
    n1 = request.args.get("n1", type=float)
    n2 = request.args.get("n2", type=float)
    op = request.args.get("op", default="add")
    if n1 is None or n2 is None or op is None:
        return "n1 atau n2 atau operator salah, contoh url benar localhost:5050/calculator?n1=3&n2=5&op=add"
    try:
        if op == "add":
            result = n1 + n2
            simbol = "+"
        elif op == "subtract":
            result = n1 - n2
            simbol = "-"
        else:
            return "Op salah..."
    except:
        return "hitungan gagal"
    return render_template(
        "calculator.html", n1=n1, n2=n2, simbol=simbol, result=result
    )


if __name__ == "__main__":
    app.run(debug=True)
