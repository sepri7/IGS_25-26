import React from "react";
import { Text, View } from "react-native";
import { Gesture, GestureDetector } from "react-native-gesture-handler";
import Animated, {
  useAnimatedStyle,
  useSharedValue,
} from "react-native-reanimated";
export default function FadeInOut() {
  const x = useSharedValue(0);
  const y = useSharedValue(0);
  const DragStyle = useAnimatedStyle(() => ({
    transform: [{ translateX: x.value }, { translateY: y.value }],
  }));
  const Drag = Gesture.Pan().onChange((event) => {
    x.value += event.changeX;
    y.value += event.changeY;
  });
  return (
    <View>
      <GestureDetector gesture={Drag}>
        <Animated.View style={DragStyle}>
          <Text>Ignatius Global School</Text>
        </Animated.View>
      </GestureDetector>
    </View>
  );
}
