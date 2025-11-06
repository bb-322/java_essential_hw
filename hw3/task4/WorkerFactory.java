package hw3.task4;

class DocumentWorker {
    public void openDoc() {
        System.out.println("doc opened");
    }

    public void editDoc() {
        System.out.println("editing available in PRO version only");
    }

    public void saveDoc() {
        System.out.println("saving available in PRO version only");
    }
}

class ProDocumentWorker extends DocumentWorker {
    @Override
    public void editDoc() {
        System.out.println("doc edited");
    }

    @Override
    public void saveDoc() {
        System.out.println("saved in old format; new format available in EXPERT version");
    }
}

class ExpertDocumentWorker extends ProDocumentWorker {
    @Override
    public void saveDoc() {
        System.out.println("doc saved in new format");
    }
}

class WorkerFactory {
    public static DocumentWorker createWorker(Integer key) {
        if (key == null) {
            return new DocumentWorker();
        } else if (key == 11111) {
            return new ProDocumentWorker();
        } else if (key == 22222) {
            return new ExpertDocumentWorker();
        } else {
            return new DocumentWorker();
        }
    }
}
