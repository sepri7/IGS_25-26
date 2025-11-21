import os
os.environ["KIVY_GL_BACKEND"] = "angle_sdl2"
from kivy.app import App
from kivy.uix.boxlayout import BoxLayout
from kivy.uix.label import Label
from kivy.uix.textinput import TextInput
from kivy.uix.button import Button
from kivy.uix.image import Image
from kivy.uix.popup import Popup

class LayoutApp(BoxLayout):
    def __init__(self, **kwargs):
        super().__init__(orientation ="vertical", padding= 20, spacing=20, **kwargs)
        self.img = Image(source="bird.png", size_hint_y=None, height=200 )
        self.add_widget(self.img)

        self.nama = TextInput(hint_text="entry nama kamu", size_hint_y=None, height= 50)
        self.add_widget(self.nama)
        
        self.umur = TextInput(hint_text="entry umur kamu", size_hint_y=None, height= 50, input_filter="int")
        self.add_widget(self.umur)

        self.btn = Button(text="Hallo", size_hint_y =None, height=50)
        self.btn.bind(on_press=self.sayHallo)
        self.add_widget(self.btn)
    
    def sayHallo(self, instance):
        jumlahUmur = int(self.umur.text) + float(self.umur.text)
        
        content = BoxLayout(orientation='vertical')
        content.add_widget(Label(text=f"hallo nama kamu ? {self.nama.text}, berusia {self.umur.text} = {jumlahUmur}"))
        close_btn = Button(text="close", size_hint_y=None, height=40)
        content.add_widget(close_btn)
        popup = Popup(
            title="say",
            content=content,
            size_hint=(0.6, 0.4),
            auto_dismiss=False
        )
        close_btn.bind(on_press=popup.dismiss)
        popup.open()


class myApp(App):
    def build(self):
        return LayoutApp()

if __name__ == "__main__":
    myApp().run()