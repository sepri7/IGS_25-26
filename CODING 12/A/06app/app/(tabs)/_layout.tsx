import { Ionicons } from "@expo/vector-icons";
import { Tabs } from "expo-router";

export default function Layout() {
  // return <Stack />;
  return (
    <Tabs
      screenOptions={{
        // headerShown: true,
        headerStyle: {
          backgroundColor: "rgba(105, 89, 219, 1)",
          borderBottomColor: "#1a1a1aff",
          borderBottomWidth: 2,
        },
        headerTintColor: "#1fff2acc",
        tabBarActiveTintColor: "#1fff2acc",
        tabBarActiveBackgroundColor: "rgba(105, 89, 219, 1)",
      }}
    >
      <Tabs.Screen
        name="index"
        options={{
          title: "Home",
          tabBarIcon: ({ size, color }) => (
            <Ionicons name="home" size={size} color={color} />
          ),
        }}
      />
      <Tabs.Screen
        name="Detail"
        options={{
          title: "Screen-2",
          tabBarIcon: ({ size, color }) => (
            <Ionicons name="compass" size={size} color={color} />
          ),
        }}
      />
      <Tabs.Screen
        name="countScreen"
        options={{
          title: "Screen-3",
          tabBarIcon: ({ size, color }) => (
            <Ionicons name="calculator" size={size} color={color} />
          ),
        }}
      />
    </Tabs>
  );
}
