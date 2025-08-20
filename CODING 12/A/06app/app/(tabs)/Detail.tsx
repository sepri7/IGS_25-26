import { Link, router } from "expo-router";
import { Text, TouchableOpacity, View } from "react-native";
import globalStyle from "../../styles/globalStyle";
import indexStyle from "../../styles/indexStyle";

const index = () => {
  return (
    <View style={globalStyle.container}>
      <Text style={indexStyle.textHome}>DETAIL SCREEN</Text>
      <View></View>
    </View>
  );
};

export default index;
