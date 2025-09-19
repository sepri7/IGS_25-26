import global from "@/styles/global";
import React, { useEffect, useState } from "react";
import { Button, FlatList, ScrollView, Text, View } from "react-native";
import { TextInput } from "react-native-gesture-handler";

export default function App() {
  const [data, setData] = useState([]);
  const [ nama, setNama ] = useState("");
  const [ guru, setGuru ] = useState("");
  
  useEffect(() => {
    ambilData();
  }, []);

  const API_URL = "http://192.168.227.182:8080/pelajaran" // ganti/sesuaikan local address

  const ambilData = async () => {
    try {
      const response = await fetch( API_URL );
      const json = await response.json();
      setData(json);
    } catch (e) {
      console.log(e);
    }
  };

  const addPelajaran = async () => {
    try{
      await fetch(API_URL, {
        method : "POST",
        headers : { "Content-Type" : "application/json" },
        body : JSON.stringify({ nama, guru }),
      });
      setNama("");
      setGuru("");
      ambilData();
    }
    catch(e){
      console.log("Error tambah:", e)
    }
  };

  return (
    <ScrollView>
    <Text>INPUT DATA PELAJARAN</Text>
      <TextInput placeholder="Nama Pelajaran : " value={nama} onChangeText={setNama}
      style= {{ borderWidth:1, marginBottom:4, padding: 7 }}
      />
      <TextInput placeholder="Nama Guru : " value={guru} onChangeText={setGuru}
      style= {{ borderWidth:1, marginBottom:4, padding: 7 }}
      />
      <Button title="Tambah" onPress={addPelajaran} />
      
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
