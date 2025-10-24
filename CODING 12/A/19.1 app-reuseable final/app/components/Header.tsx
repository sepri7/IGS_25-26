import { StyleSheet, Text, View } from "react-native";

interface HeaderProp {
  title: string;
}

const Header: React.FC<HeaderProp> = ({ title }) => {
  return (
    <View style={StyleHeader.ContainerHeader}>
      <Text style={StyleHeader.Text}>--{title}--</Text>
    </View>
  );
};

export default Header;

export const StyleHeader = StyleSheet.create({
  ContainerHeader: {
    backgroundColor: "#12e1b4ff",
    alignItems: "center",
    paddingVertical: 20,
  },
  Text: {
    fontSize: 25,
    fontWeight: "bold",
    color: "#ffffffff",
  },
});
