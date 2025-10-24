import { ScrollView } from "react-native";
import Card from "./components/Card";
import Header from "./components/Header";

export default function index() {
  return (
    <ScrollView>
      <Header title="HEADER TITLE.." />

      <Card
        title="Content of Index"
        no={1}
        subTitle="Lorem ipsum dolor sit amet consectetur adipisicing elit. Praesentium, assumenda dignissimos beatae repellendus, magni tempora tempore nulla qui incidunt excepturi molestiae sed quisquam eligendi eos quasi libero temporibus autem harum!"
      />
    </ScrollView>
  );
}
