from flask import Flask

app = Flask(__name__)

@app.route("/")
@app.route("/home")
def home():
    return f"Hello...."

if __name__ =="__main__":
    app.run(debug=True, host="0.0.0.0",  port=5000)