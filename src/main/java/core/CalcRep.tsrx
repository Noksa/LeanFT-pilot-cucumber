<?xml version="1.0" encoding="utf-8" standalone="yes"?>
<applicationModel>
    <name>Application Model</name>
    <className>CalcRep</className>
    <objects>
        <object type="Window" technology="Standard Windows">
            <name>Калькулятор</name>
            <codeName>Window</codeName>
            <identification>
                <properties>
                    <property name="IsChildWindow" type="boolean" isRegExp="false">false</property>
                    <property name="IsOwnedWindow" type="boolean" isRegExp="false">false</property>
                    <property name="WindowClassRegExp" type="string" isRegExp="false">ApplicationFrameWindow</property>
                    <property name="WindowTitleRegExp" type="string" isRegExp="false">Калькулятор</property>
                </properties>
            </identification>
            <children>
                <object type="UiObject" technology="Standard Windows">
                    <name>ApplicationFrameTitleBarWindow</name>
                    <codeName>ApplicationFrameTitleBarWindowUiObject</codeName>
                    <identification>
                        <properties>
                            <property name="WindowClassRegExp" type="string" isRegExp="false">ApplicationFrameTitleBarWindow</property>
                        </properties>
                    </identification>
                </object>
                <object type="UiObject" technology="Standard Windows">
                    <name>Калькулятор</name>
                    <codeName>UiObject</codeName>
                    <identification>
                        <properties>
                            <property name="WindowClassRegExp" type="string" isRegExp="false">Windows.UI.Core.CoreWindow</property>
                        </properties>
                    </identification>
                </object>
                <object type="UiObject" technology="Standard Windows">
                    <name>ApplicationFrameInputSinkWindow</name>
                    <codeName>ApplicationFrameInputSinkWindowUiObject</codeName>
                    <identification>
                        <properties>
                            <property name="WindowClassRegExp" type="string" isRegExp="false">ApplicationFrameInputSinkWindow</property>
                        </properties>
                    </identification>
                </object>
            </children>
        </object>
    </objects>
</applicationModel>
