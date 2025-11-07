import React from "react";
import { Button, Text, View } from "react-native";
import { useTheme } from "./ThemeContext";
export default function Home() {
  const { theme, toggleTheme } = useTheme();
  return (
    <View
      style={{
        flex: 1,
        justifyContent: "center",
        alignItems: "center",
        backgroundColor: theme === "light" ? "#fff" : "#222",
      }}
    >
      <Text
        style={{ color: theme === "light" ? "#000" : "#fff", marginBottom: 20 }}
      >
        Selamat Datang ...{" "}
      </Text>
      <Button
        title={`Switch to ${theme === "light" ? "Dark" : "Light"} Mode`}
        onPress={toggleTheme}
      />
    </View>
  );
}
