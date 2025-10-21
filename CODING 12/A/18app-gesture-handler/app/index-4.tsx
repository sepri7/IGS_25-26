import React from "react";
import { Text, View } from "react-native";
import {
  Gesture,
  GestureDetector,
  GestureHandlerRootView,
} from "react-native-gesture-handler";
import Animated, {
  useAnimatedStyle,
  useSharedValue,
  withSpring,
} from "react-native-reanimated";

function DragDrop({ image, name }) {
  const x = useSharedValue(0);
  const y = useSharedValue(0);

  const drag = Gesture.Pan()
    .onChange((event) => {
      x.value += event.changeX;
      y.value += event.changeY;
    })
    .onEnd(() => {
      x.value = withSpring(0);
      y.value = withSpring(0);
    });

  const moveStyle = useAnimatedStyle(() => ({
    transform: [{ translateX: x.value }, { translateY: y.value }],
  }));

  return (
    <GestureDetector gesture={drag}>
      <Animated.View style={[moveStyle]}>
        <Animated.Image
          source={{ uri: image }}
          style={{
            width: 120,
            height: 120,
          }}
          resizeMode="cover"
        />
        <Text>{name}</Text>
      </Animated.View>
    </GestureDetector>
  );
}

export default function App() {
  return (
    <GestureHandlerRootView>
      <View>
        <DragDrop
          image="https://media.cake.me/image/upload/s--Vva9BGk8--/c_pad,fl_png8,h_315,w_600/v1672469692/fhdgl3b3l2ogmfmzizdr.png"
          name="IGS"
        />
      </View>
    </GestureHandlerRootView>
  );
}
