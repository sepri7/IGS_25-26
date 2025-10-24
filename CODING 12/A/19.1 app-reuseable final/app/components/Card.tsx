import { StyleSheet, Text, View } from "react-native";
interface CardProp {
  title: string;
  no: number;
  subTitle: string;
}
const Card: React.FC<CardProp> = ({ title, no, subTitle }) => {
  {
    return (
      <View style={StyleCard.containerCard}>
        <Text style={StyleCard.TextTitle}>
          {no} - {title}
        </Text>
        <Text style={{ color: "#09128aff" }}> {subTitle} </Text>
      </View>
    );
  }
};
export default Card;

export const StyleCard = StyleSheet.create({
  containerCard: {
    backgroundColor: "rgba(189, 189, 189, 1)",
    margin: 20,
    padding: 15,
  },
  TextTitle: {
    fontSize: 20,
    fontWeight: "bold",
    color: "#003089ff",
  },
});
