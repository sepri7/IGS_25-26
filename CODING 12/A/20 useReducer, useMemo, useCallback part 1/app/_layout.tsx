import { createDrawerNavigator } from "@react-navigation/drawer";
import { withLayoutContext } from "expo-router";

const { Navigator } = createDrawerNavigator();
export const Drawer = withLayoutContext(Navigator);

export default function RootLayout() {
  return (
    <Drawer>
      <Drawer.Screen name="useReducer" options={{ title: "useReducer" }} />
    </Drawer>
  );
}
