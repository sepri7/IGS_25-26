import { StyleGlobal } from "@/styles/global";
import { StyleIndex } from "@/styles/styleIndex";
import React from "react";
import { Button, Image, Text, View } from "react-native";
import { Gesture, GestureDetector } from "react-native-gesture-handler";
import Animated, {
  useAnimatedStyle,
  useSharedValue,
  withTiming,
} from "react-native-reanimated";
export default function FadeInOut() {
  const opacity = useSharedValue(0);
  const x = useSharedValue(0);
  const y = useSharedValue(0);
  const animatedStyle = useAnimatedStyle(() => ({
    opacity: opacity.value,
  }));
  const DragStyle = useAnimatedStyle(() => ({
    transform: [{ translateX: x.value }, { translateY: y.value }],
  }));
  const Drag = Gesture.Pan().onChange((event) => {
    x.value += event.changeX;
    y.value += event.changeY;
  });
  return (
    <View style={StyleGlobal.container}>
      <GestureDetector gesture={Drag}>
        <Animated.View
          style={[animatedStyle, StyleIndex.containerImg, DragStyle]}
        >
          <Image
            source={{
              uri: "https://media.cake.me/image/upload/s--Vva9BGk8--/c_pad,fl_png8,h_315,w_600/v1672469692/fhdgl3b3l2ogmfmzizdr.png",
            }}
            style={StyleIndex.imgLogo}
            // style={{ height: 100, width: 100 }}
          />
          <Text style={StyleIndex.textSekolah}>Ignatius Global School</Text>
          <Text style={StyleIndex.textMotto}>
            The First Choice to the Future
          </Text>
        </Animated.View>
      </GestureDetector>
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
