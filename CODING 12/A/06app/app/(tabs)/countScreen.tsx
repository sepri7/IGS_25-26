import { router } from "expo-router";
import { useState } from "react";
import { Text, TouchableOpacity, View } from "react-native";
import countStyle from "../../styles/countStyle";
import globalStyle from "../../styles/globalStyle";

function Display({ value }: { value: number }) {
  return <Text> Jumlah : {value} </Text>;
}

const index = () => {
  const [count, setCount] = useState(0);
  return (
    <View style={globalStyle.container}>
      <Text style={countStyle.textCount}>COUNT SCREEN</Text>
      <Display value={count} />
      <TouchableOpacity
        style={globalStyle.button}
        onPress={() => setCount(count + 1)}
      >
        <Text style={{ color: "#ffffff" }}> Tambah+ </Text>
      </TouchableOpacity>
      <TouchableOpacity
        style={globalStyle.button}
        onPress={() => setCount(count - 1)}
      >
        <Text style={{ color: "#ffffff" }}> kurang- </Text>
      </TouchableOpacity>
      <TouchableOpacity style={globalStyle.button} onPress={() => setCount(0)}>
        <Text style={{ color: "#ffffff" }}> reset </Text>
      </TouchableOpacity>

      <View>
        <TouchableOpacity
          onPress={() => router.back()}
          style={globalStyle.button}
        >
          <Text>🏠Home</Text>
        </TouchableOpacity>
      </View>
    </View>
  );
};

export default index;
