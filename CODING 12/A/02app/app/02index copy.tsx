import { useState } from "react";
import { Button, ScrollView, StyleSheet, Text, TextInput } from "react-native";

const index = () => {
  const [Name, setName] = useState("");
  const ms = () => {
    // Alert.alert(`From Android`);
    alert(`From Web ${Name || "Anonymous"}`);
  };
  return (
    <ScrollView>
      <Text>Masukkan nama : </Text>
      <TextInput value={Name} onChangeText={setName} style={styles.label} />
      <Button title="Send" onPress={ms} />
    </ScrollView>
  );
};
const styles = StyleSheet.create({
  label: {
    borderColor: "black",
    borderWidth: 2,
    padding: 10,
    margin: 5,
    borderRadius: 5,
  },
});
export default index;
