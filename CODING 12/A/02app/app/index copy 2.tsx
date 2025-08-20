import React, { useState } from "react";
import {
  Alert,
  Button,
  Image,
  ScrollView,
  StyleSheet,
  Text,
  TextInput,
  View,
} from "react-native";

const books = [{ title: "Laskar Pelangi", author: "Andrea Hirata" }];

export default function App() {
  const [name, setName] = useState("");

  const showMessage = () => {
    Alert.alert("Halo", `Selamat datang, ${name || "pengunjung"}!`);
    // alert("Halo dari Web!");
  };

  return (
    <ScrollView contentContainerStyle={styles.container}>
      <Image
        source={require("../assets/images/adaptive-icon.png")}
        style={styles.profileImage}
      />

      <Text style={styles.label}>Masukkan Nama:</Text>
      <TextInput
        style={styles.input}
        placeholder="Nama Anda"
        value={name}
        onChangeText={setName}
      />
      <Button title="Tampilkan Pesan" onPress={showMessage} />

      <Text style={styles.sectionTitle}>Daftar Buku:</Text>
      {books.map((book, index) => (
        <View key={index} style={styles.bookRow}>
          <Image
            source={require("../assets/images/adaptive-icon.png")}
            style={styles.bookImage}
          />
          <View style={styles.bookInfo}>
            <Text style={styles.bookTitle}>{book.title}</Text>
            <Text style={styles.bookAuthor}>{book.author}</Text>
          </View>
        </View>
      ))}
    </ScrollView>
  );
}

const styles = StyleSheet.create({
  container: {
    padding: 20,
    alignItems: "center",
  },
  profileImage: {
    width: 100,
    height: 100,
    marginBottom: 20,
  },
  label: {
    alignSelf: "flex-start",
    fontSize: 16,
    marginBottom: 5,
  },
  input: {
    borderWidth: 1,
    borderColor: "#ccc",
    padding: 8,
    width: "100%",
    marginBottom: 10,
    borderRadius: 5,
  },
  sectionTitle: {
    marginTop: 20,
    marginBottom: 10,
    fontWeight: "bold",
    fontSize: 16,
    alignSelf: "flex-start",
  },
  bookRow: {
    flexDirection: "row",
    alignItems: "center",
    marginBottom: 10,
    padding: 10,
    backgroundColor: "#f2f2f2",
    borderRadius: 8,
    width: "100%",
  },
  bookImage: {
    width: 50,
    height: 50,
    marginRight: 10,
  },
  bookInfo: {
    flex: 1,
  },
  bookTitle: {
    fontWeight: "bold",
    fontSize: 16,
  },
  bookAuthor: {
    color: "#555",
    fontSize: 14,
  },
});
