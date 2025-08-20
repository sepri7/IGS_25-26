import { Link, router } from "expo-router";
import { Text, TouchableOpacity, View } from "react-native";
import globalStyle from "../../styles/globalStyle";
import indexStyle from "../../styles/indexStyle";

const index = () => {
  return (
    <View style={globalStyle.container}>
      <Text style={indexStyle.textHome}>HOME SCREEN</Text>
      <View>
        <TouchableOpacity
          onPress={() => router.push("/countScreen")}
          style={globalStyle.button}
        >
          <Text style={globalStyle.textButton}>CountDisplay</Text>
        </TouchableOpacity>

        <Link href="/countScreen" style={globalStyle.button}>
          ➕CountDisplay-2
        </Link>
      </View>
    </View>
  );
};

export default index;
