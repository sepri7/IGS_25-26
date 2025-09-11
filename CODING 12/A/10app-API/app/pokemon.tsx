import global from "@/styles/global";
import React, { useEffect, useState } from "react";
import { FlatList, Image, ScrollView, Text, View } from "react-native";

export default function App() {
  const [data, setData] = useState([]);
  const [input, setInput] = useState("");
  useEffect(() => {
    ambilData();
  }, []);

  const ambilData = async () => {
    try {
      const response = await fetch(
        "https://api.pokemontcg.io/v2/cards?page=1&pageSize=20"
      );
      const json = await response.json();
      setData(json.data);
    } catch (e) {
      console.log(e);
    }
  };

  return (
    <ScrollView>
      <Text>DATA POKEMON</Text>
      <FlatList
        data={data}
        keyExtractor={(item, index) => index.toString()}
        renderItem={({ item }) => (
          <View style={global.card}>
            <Text>{item.name}</Text>
            <Image
              source={{ uri: item.images.small }}
              style={{ width: 100, height: 140 }}
            />
          </View>
        )}
      />
    </ScrollView>
  );
}
