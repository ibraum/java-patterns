class Element:
    def accept(self, visitor):
        pass

class ConcreteElementA(Element):
    def accept(self, visitor):
        visitor.visit(self)

class ConcreteElementB(Element):
    def accept(self, visitor):
        visitor.visit(self)

class Visitor:
    def visit(self, element):
        pass

class ConcreteVisitor(Visitor):
    def visit(self, element):
        print(f"Visiting {element.__class__.__name__}")

# Utilisation
visitor = ConcreteVisitor()
element_a = ConcreteElementA()
element_b = ConcreteElementB()
element_a.accept(visitor)
element_b.accept(visitor)
