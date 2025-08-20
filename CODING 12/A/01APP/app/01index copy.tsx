import React, { StyleSheet, View } from "react-native";
const index = () => {
  return (
    <View style={styles.container}>
      <View style={styles.box1}></View>
      <View style={styles.box2}></View>
      <View style={styles.box3}></View>
    </View>
  );
};
const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: "#9f9f9fff",
    // justifyContent: "center",
    // alignItems: "center",
    flexDirection: "row",
  },
  box1: {
    backgroundColor: "#313deaff",
    // flex: 2,
    // margin: 20,
    width: 100,
    height: 100,
  },
  box2: {
    backgroundColor: "#1ce93eff",
    // flex: 7,
    // margin: 20,
    width: 100,
    height: 100,
  },
  box3: {
    backgroundColor: "#000000ff",
    // flex: 30,
    // margin: 20,
    width: 100,
    height: 100,
  },
});
export default index;
