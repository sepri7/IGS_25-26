import os
os.environ["KIVY_GL_BACKEND"] = "angle_sdl2"
#di atas alternatif untuk menampilkan dengan directX12
from kivy.app import App
from kivy.uix.label import Label

class MyFirstKivy(App):
    def build(self):
        return Label(text="Hello World")

if __name__ == "__main__":
    MyFirstKivy().run()

