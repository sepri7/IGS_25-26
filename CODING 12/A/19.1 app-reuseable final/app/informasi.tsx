import { ScrollView } from "react-native";
import Card from "./components/Card";
import Header from "./components/Header";

export default function index() {
  return (
    <ScrollView>
      <Header title="INFORMASI" />

      <Card title="Content of Informasi" no={2} subTitle="berhasil...." />
    </ScrollView>
  );
}
