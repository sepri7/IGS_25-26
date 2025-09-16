import global from "@/styles/global";
import React, { useEffect, useState } from "react";
import { FlatList, ScrollView, Text, View } from "react-native";

export default function App() {
  const [data, setData] = useState([]);
  
  useEffect(() => {
    ambilData();
  }, []);

  const ambilData = async () => {
    try {
      const response = await fetch(
        "http://192.168.227.182:8080/pelajaran" // ganti/sesuaikan local address
      );
      const json = await response.json();
      setData(json);
    } catch (e) {
      console.log(e);
    }
  };

  return (
    <ScrollView>
      <Text>DATA PELAJARAN</Text>
      <FlatList
        data={data}
        keyExtractor={(item, index) => index.toString()}
        renderItem={({ item }) => (
          <View style={global.card}>
            <Text>{item.nama}</Text>
            <Text>😎 GURU : {item.guru}</Text>
          </View>
        )}
      />
    </ScrollView>
  );
}
