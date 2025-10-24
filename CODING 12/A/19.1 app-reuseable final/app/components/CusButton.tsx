import { Text, TouchableOpacity, View } from "react-native";

export default function CusButton({
  title,
  onPress,
}: {
  title: string;
  onPress: () => void;
}) {
  return (
    <View style={{ flex: 1, alignItems: "center" }}>
      <TouchableOpacity
        onPress={onPress}
        style={{ backgroundColor: "#67f56cff", padding: 10, width: 200 }}
      >
        <Text> {title} </Text>
      </TouchableOpacity>
    </View>
  );
}
