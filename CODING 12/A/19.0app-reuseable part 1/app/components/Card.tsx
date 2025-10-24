import { Text, View } from "react-native";
interface CardProp {
  title: string;
  no: number;
  subTitle: string;
}
const Card: React.FC<CardProp> = ({ title, no, subTitle }) => {
  {
    return (
      <View>
        <Text>
          {no} - {title}
        </Text>
        <Text> {subTitle} </Text>
      </View>
    );
  }
};
export default Card;
