import os
os.environ["KIVY_GL_BACKEND"] = "angle_sdl2"
#di atas alternatif untuk menampilkan dengan directX12
from kivy.app import App
from kivy.uix.label import Label
from kivy.uix.boxlayout import BoxLayout
from kivy.uix.button import Button
from kivy.uix.textinput import TextInput

class LayoutTester(BoxLayout):
    def __init__(self, **kwargs):
        super().__init__( orientation="vertical", padding=20, **kwargs)

        self.add_widget(Label(text="NAMA"))
        self.nama = TextInput(hint_text="Enter nama kamu..")
        self.add_widget(self.nama)
        
        self.add_widget(Label(text="kELAS"))
        self.kelas = TextInput(hint_text="Enter kelas kamu..")
        self.add_widget(self.kelas)

        self.btn = Button(text="TAMPIL DATA")
        self.btn.bind(on_press=self.tampilData)
        self.add_widget(self.btn)
        self.output = Label(text="")
        self.add_widget(self.output)

    def tampilData(self, instance ):
        nama = self.nama.text
        kelas = self.kelas.text
        self.output.text = (
            f"haii namaku = {nama} sekarang ada di kelas {kelas}"
        )

class MyFirstKivy(App):
    def build(self):
        return LayoutTester()

if __name__ == "__main__":
    MyFirstKivy().run()

