import global from "@/styles/global";
import { Picker } from "@react-native-picker/picker";
import React, { useEffect, useState } from "react";
import { Button, FlatList, ScrollView, Text, TouchableOpacity, View } from "react-native";
import { TextInput } from "react-native-gesture-handler";

export default function App() {
  const [data, setData] = useState([]);
  const [nama, setNama] = useState("");
  const [guru, setGuru] = useState("");
  const [email, setEmail] = useState("");
  const [tanggal, setTanggal] = useState("");
  const [mapel, setMapel] = useState("Matematika");
  const [jenisKelamin, setJenisKelamin] = useState("L");
  const [catatan, setCatatan] = useState("");
  const [idEdit, setIdEdit] = useState(null);

  useEffect(() => {
    ambilData();
  }, []);

  const API_URL = "http://192.168.100.182:8080/pelajaran"; // ganti/sesuaikan local address

  const ambilData = async () => {
    try {
      const response = await fetch(API_URL);
      const json = await response.json();
      setData(json);
    } catch (e) {
      console.log(e);
    }
  };

  const addPelajaran = async () => {
    try {
      await fetch(API_URL, {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({ nama, guru, email, tanggal, mapel, jenisKelamin, catatan }),
      });
      setNama("");
      setGuru("");
      setEmail("");
      setTanggal("");
      setMapel("Matematika");
      setJenisKelamin("L");
      setCatatan("");
      ambilData();
    } catch (e) {
      console.log("Error tambah:", e);
    }
  };

  const updatePelajaran = async () => {
    try {
      await fetch(`${API_URL}/${idEdit}`, {
        method: "PUT",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({ nama, guru, email, tanggal, mapel, jenisKelamin, catatan }),
      });
      setNama("");
      setGuru("");
      setEmail("");
      setTanggal("");
      setMapel("Matematika");
      setJenisKelamin("L");
      setCatatan("");
      setIdEdit(null);
      ambilData();
    } catch (e) {
      console.log("error update", e);
    }
  };

  const deletePelajaran = async (id) => {
    try {
      await fetch(`${API_URL}/${id}`, {
        method: "DELETE",
      });
      ambilData();
    } catch (e) {
      console.log("error delete... ", e);
    }
  };

  const patchPelajaran = async (id, newData) => {
    try {
      await fetch(`${API_URL}/${id}`, {
        method: "PATCH",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({ nama: newData }),
      });
      ambilData();
    } catch (e) {
      console.log("Error patch..", e);
    }
  };

  return (
    <ScrollView>
      <Text>INPUT DATA PELAJARAN</Text>

      {/* Nama */}
      <TextInput
        placeholder="Nama Pelajaran : "
        value={nama}
        onChangeText={setNama}
        style={{ borderWidth: 1, marginBottom: 4, padding: 7 }}
      />

      {/* Guru */}
      <TextInput
        placeholder="Nama Guru : "
        value={guru}
        onChangeText={setGuru}
        style={{ borderWidth: 1, marginBottom: 4, padding: 7 }}
      />

      {/* Email */}
      <TextInput
        placeholder="Email Guru : "
        value={email}
        onChangeText={setEmail}
        keyboardType="email-address"
        style={{ borderWidth: 1, marginBottom: 4, padding: 7 }}
      />

      {/* Tanggal */}
      <TextInput
        placeholder="Tanggal (YYYY-MM-DD)"
        value={tanggal}
        onChangeText={setTanggal}
        style={{ borderWidth: 1, marginBottom: 4, padding: 7 }}
      />

      {/* Select Option */}
      <Text>Pilih Mapel:</Text>
      <Picker
        selectedValue={mapel}
        style={{ borderWidth: 1, marginBottom: 4 }}
        onValueChange={(itemValue) => setMapel(itemValue)}
      >
        <Picker.Item label="Matematika" value="Matematika" />
        <Picker.Item label="Bahasa Inggris" value="Bahasa Inggris" />
        <Picker.Item label="Informatika" value="Informatika" />
        <Picker.Item label="Fisika" value="Fisika" />
      </Picker>

      {/* Radio Button */}
      <Text>Jenis Kelamin:</Text>
      <View style={{ flexDirection: "row", marginBottom: 8 }}>
        {["L", "P"].map((jk) => (
          <TouchableOpacity
            key={jk}
            onPress={() => setJenisKelamin(jk)}
            style={{ flexDirection: "row", alignItems: "center", marginRight: 10 }}
          >
            <View
              style={{
                height: 20,
                width: 20,
                borderRadius: 10,
                borderWidth: 1,
                alignItems: "center",
                justifyContent: "center",
                marginRight: 4,
              }}
            >
              {jenisKelamin === jk && (
                <View
                  style={{
                    height: 10,
                    width: 10,
                    borderRadius: 5,
                    backgroundColor: "blue",
                  }}
                />
              )}
            </View>
            <Text>{jk === "L" ? "Laki-laki" : "Perempuan"}</Text>
          </TouchableOpacity>
        ))}
      </View>

      {/* TextArea */}
      <TextInput
        placeholder="Catatan Tambahan"
        value={catatan}
        onChangeText={setCatatan}
        multiline
        numberOfLines={4}
        style={{ borderWidth: 1, marginBottom: 4, padding: 7, textAlignVertical: "top" }}
      />

      {/* Button */}
      {idEdit ? (
        <Button title="Update" onPress={updatePelajaran} />
      ) : (
        <Button title="Tambah" onPress={addPelajaran} />
      )}

      <Text>DATA PELAJARAN</Text>

      <FlatList
        data={data}
        keyExtractor={(item, index) => index.toString()}
        renderItem={({ item }) => (
          <View style={global.card}>
            <Text>{item.nama}</Text>
            <Text>😎 GURU : {item.guru}</Text>
            <Text>email : {item.email}</Text>
            <Text>tanggal : {item.tanggal}</Text>
            <Text> Mapel: {item.mapel}</Text>
            <Text>👤 JK: {item.jenisKelamin}</Text>
            <Text>catatan : {item.catatan}</Text>

            <Button
              title="UPDATE"
              color="blue"
              onPress={() => {
                setNama(item.nama);
                setGuru(item.guru);
                setEmail(item.email);
                setTanggal(item.tanggal);
                setMapel(item.mapel);
                setJenisKelamin(item.jenisKelamin);
                setCatatan(item.catatan);
                setIdEdit(item.id);
              }}
            />
            <Button
              title="DELETE"
              color="red"
              onPress={() => {
                deletePelajaran(item.id);
              }}
            />
            <Button
              title="PATCH : UBAH MAPEL MENJADI -> CODING"
              color="green"
              onPress={() => {
                patchPelajaran(item.id, "CODING");
              }}
            />
          </View>
        )}
      />
    </ScrollView>
  );
}
