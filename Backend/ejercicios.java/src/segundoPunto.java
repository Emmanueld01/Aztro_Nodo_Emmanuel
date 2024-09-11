public class segundoPunto {
    public static void main(String[] args) {
        personalAdmvo personalAdmvo = new personalAdmvo();
        voluntarioInterno voluntarioInterno = new voluntarioInterno();
        voluntarioExterno voluntarioExterno = new voluntarioExterno();
        profesorInterno profesorInterno = new profesorInterno();
        profesorTitular profesorTitular = new profesorTitular();

        personalAdmvo.metodoAsalariado();
        voluntarioInterno.metodoVoluntario();
        voluntarioExterno.metodoVoluntario();
        profesorInterno.metodoAsalariado();
        profesorTitular.metodoAsalariado();
    }
}

final class profesorInterno extends profesor {
    @Override
    protected void metodoExclusivo() {
        System.out.println("Método exclusivo de profesorInterno");
    }

    @Override
    public void metodoAsalariado() {
        System.out.println("Método de Asalariado en profesorInterno");
    }
}

final class profesorTitular extends profesor {
    @Override
    protected void metodoExclusivo() {
        System.out.println("Método exclusivo de profesorTitular");
    }

    @Override
    public void metodoAsalariado() {
        System.out.println("Método de Asalariado en profesorTitular");
    }
}

final class personalAdmvo extends asalariado {
    @Override
    public void metodoAsalariado() {
        System.out.println("Método de Asalariado en personalAdmvo");
    }

    @Override
    protected void metodoExclusivo() {
        System.out.println("Método exclusivo de personalAdmvo");
    }
}

class profesor extends asalariado {
    @Override
    public void metodoAsalariado() {
        System.out.println("Método de Asalariado en profesor");
    }

    @Override
    protected void metodoExclusivo() {
        System.out.println("Método exclusivo de profesor");
    }
}

final class voluntarioInterno extends voluntario {
    @Override
    public void metodoVoluntario() {
        System.out.println("Método de Voluntario en voluntarioInterno");
    }

    @Override
    protected void metodoExclusivo() {
        System.out.println("Método exclusivo de voluntarioInterno");
    }
}

final class voluntarioExterno extends voluntario {
    @Override
    public void metodoVoluntario() {
        System.out.println("Método de Voluntario en voluntarioExterno");
    }

    @Override
    protected void metodoExclusivo() {
        System.out.println("Método exclusivo de voluntarioExterno");
    }
}

abstract class asalariado extends persona {
    public abstract void metodoAsalariado(); 
}

abstract class voluntario extends persona {
    public abstract void metodoVoluntario(); 
}

abstract class persona {
    protected abstract void metodoExclusivo(); 
}
