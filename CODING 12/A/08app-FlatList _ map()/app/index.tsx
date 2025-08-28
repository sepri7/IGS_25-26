import React from "react";
import { FlatList, ScrollView, Text, View } from "react-native";
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
        <FlatList
          data={mapel}
          keyExtractor={(item) => item.id}
          renderItem={({ item }) => (
            <View style={global.card}>
              <Text>{item.nama}</Text>
              <Text>{item.guru}</Text>
            </View>
          )}
        />
      </View>
    </ScrollView>
  );
}
