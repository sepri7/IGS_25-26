import { StyleGlobal } from "@/styles/global";
import React from "react";
import { Button, Image, Text, View } from "react-native";
import Animated, {
  useAnimatedStyle,
  useSharedValue,
  withTiming,
} from "react-native-reanimated";
export default function FadeInOut() {
  const opacity = useSharedValue(0);
  const animatedStyle = useAnimatedStyle(() => ({
    opacity: opacity.value,
  }));
  return (
    <View style={StyleGlobal.container}>
      <Animated.View style={animatedStyle}>
        <Image
          source={{
            uri: "https://media.cake.me/image/upload/s--Vva9BGk8--/c_pad,fl_png8,h_315,w_600/v1672469692/fhdgl3b3l2ogmfmzizdr.png",
          }}
        />
        <Text>Ignatius Global School</Text>
        <Text>The First Choice to the Future</Text>
      </Animated.View>
      <Button
        title="Show-Hidden"
        onPress={() =>
          (opacity.value = withTiming(opacity.value === 0 ? 1 : 0, {
            duration: 1000,
          }))
        }
      />
    </View>
  );
}
