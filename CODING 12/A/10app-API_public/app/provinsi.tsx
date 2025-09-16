import global from "@/styles/global";
import React, { useEffect, useState } from "react";
import { FlatList, ScrollView, Text, View } from "react-native";

export default function App() {
  const [data, setData] = useState([]);
  const [input, setInput] = useState("");
  useEffect(() => {
    ambilData();
  }, []);

  const ambilData = async () => {
    try {
      const response = await fetch(
        "https://alamat.thecloudalert.com/api/provinsi/get/"
      );
      const json = await response.json();
      setData(json.result);
    } catch (e) {
      console.log(e);
    }
  };

  return (
    <ScrollView>
      <Text>DATA PROVINSI</Text>
      <FlatList
        data={data}
        keyExtractor={(item, index) => index.toString()}
        renderItem={({ item }) => (
          <View style={global.card}>
            <Text>{item.text}</Text>
          </View>
        )}
      />
    </ScrollView>
  );
}
