import AsyncStorage from "@react-native-async-storage/async-storage";
import React, { useEffect, useState } from "react";
import {
  Button,
  FlatList,
  Text,
  TextInput,
  TouchableOpacity,
  View,
} from "react-native";
import global from "../styles/global";

export default function App() {
  const [data, setData] = useState([]);
  const [input, setInput] = useState("");
  useEffect(() => {
    ambilData();
  }, []);

  const simpanData = async () => {
    try {
      if (input.trim() === "") return;
      await AsyncStorage.setItem(input, input);
      setInput("");
      ambilData();
    } catch (e) {
      console.log(e);
    }
  };
  const ambilData = async () => {
    try {
      const keys = await AsyncStorage.getAllKeys();
      const result = await AsyncStorage.multiGet(keys);
      setData(result);
    } catch (e) {
      console.log(e);
    }
  };

  const hapusData = async (key) => {
    try {
      await AsyncStorage.removeItem(key);
      ambilData();
    } catch (e) {
      console.log(e);
    }
  };

  return (
    <View>
      <Text>DATA....</Text>
      <TextInput
        placeholder="Enter anything : "
        value={input}
        onChangeText={(text) => setInput(text)}
      />
      <Button title={"ADD"} onPress={simpanData}></Button>

      <FlatList
        data={data}
        keyExtractor={(item, index) => index.toString()}
        renderItem={({ item }) => (
          <View style={global.card}>
            <Text>
              {item[1]}

              <TouchableOpacity onPress={() => hapusData(item[0])}>
                <Text>✖</Text>{" "}
              </TouchableOpacity>
            </Text>
          </View>
        )}
      />
    </View>
  );
}
