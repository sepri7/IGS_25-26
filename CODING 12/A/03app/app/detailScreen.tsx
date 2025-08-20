import { useState } from "react";
import { StyleSheet, Text, TouchableOpacity, View } from "react-native";

function Display({ value }: { value: number }) {
  return <Text> Jumlah : {value} </Text>;
}

const index = () => {
  const [count, setCount] = useState(0);
  return (
    <View style={styles.container}>
      <Display value={count} />
      <TouchableOpacity
        style={styles.button}
        onPress={() => setCount(count + 1)}
      >
        <Text style={{ color: "#ffffff" }}> Tambah+ </Text>
      </TouchableOpacity>
      <TouchableOpacity
        style={styles.button}
        onPress={() => setCount(count - 1)}
      >
        <Text style={{ color: "#ffffff" }}> kurang- </Text>
      </TouchableOpacity>
      <TouchableOpacity style={styles.button} onPress={() => setCount(0)}>
        <Text style={{ color: "#ffffff" }}> reset </Text>
      </TouchableOpacity>
    </View>
  );
};

export default index;

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: "center",
    alignItems: "center",
  },
  button: {
    backgroundColor: "#3817baff",
    paddingVertical: 9,
    paddingHorizontal: 14,
    marginVertical: 15,
    borderRadius: 10,
    width: 100,
  },
});
