from flask import Flask, jsonify
from flask_cors import CORS

app = Flask(__name__)
CORS(app)

pelajaran = [
    {"id": 1, "mapel": "Informatika", "guru": "sir anas"},
    {"id": 2, "mapel": "Matematika", "guru": "sir nando"},
    {"id": 3, "mapel": "Biologi", "guru": "sir Veri"},
]

@app.route("/pelajaran", methods=["GET"])
def get_all():
    return jsonify(pelajaran)

if __name__ == "__main__":
    app.run(debug=True, host="0.0.0.0", port=8080)
