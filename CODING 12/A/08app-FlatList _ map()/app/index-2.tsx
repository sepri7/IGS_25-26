import React from "react";
import { ScrollView, Text, View } from "react-native";
import global from "../styles/global";
const mapel = [
  { id: "1", nama: "Informatika", guru: "Sir Sepri" },
  { id: "2", nama: "Matematika", guru: "Sir Nando" },
  { id: "3", nama: "Fisika", guru: "Sir Ardi" },
  { id: "4", nama: "Biologi", guru: "Sir Veri" },
  { id: "5", nama: "Seni Budaya", guru: "Sir dan" },
];
export default function Tester() {
  return (
    <ScrollView>
      <View>
        <Text style={global.text}>Daftar Pelajaran</Text>
        {mapel.map((item) => (
          <View key={item.id} style={global.card}>
            <Text>{item.nama}</Text>
            <Text>{item.guru}</Text>
          </View>
        ))}
      </View>
    </ScrollView>
  );
}
