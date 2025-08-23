import { ScrollView, Text, View } from "react-native";
import global from "../styles/global";
const index = () => {
  return (
    <ScrollView contentContainerStyle={{ flexGrow: 1 }}>
      <View style={global.container}>
        <Text>HomeScreen</Text>
      </View>
    </ScrollView>
  );
};

export default index;
