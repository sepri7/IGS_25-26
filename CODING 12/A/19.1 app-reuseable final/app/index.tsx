import { Link } from "expo-router";
import { ScrollView } from "react-native";
import Card from "./components/Card";
import CusButton from "./components/CusButton";
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
      <Link href="/informasi" asChild>
        <CusButton title="Link-to-Infomasi" onPress={() => {}} />
      </Link>
    </ScrollView>
  );
}
