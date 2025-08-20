import { router } from "expo-router";
import { StyleSheet, Text, TouchableOpacity, View } from "react-native";

const index = () => {
  return (
    <View style={styles.container}>
      <Text>HOME...</Text>
      <View>
        <TouchableOpacity onPress={() => router.back()}>
          <Text>Home</Text>
        </TouchableOpacity>
        <TouchableOpacity onPress={() => router.push("/countScreen")}>
          <Text>CountDisplay</Text>
        </TouchableOpacity>
      </View>
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
